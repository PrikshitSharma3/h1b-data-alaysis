register /usr/local/hive/lib/hive-exec-1.2.1.jar
register /usr/local/hive/lib/hive-common-1.2.1.jar

data = LOAD '/user/hive/warehouse/project.db/h1b_final' using PigStorage('\t') as(s_no:int, case_status:chararray, employer_name:chararray, soc_name:chararray, job_title:chararray, full_time_position:chararray, prevailing_wage:int, year:chararray, worksite:chararray, longitude:double, latitude:double);

RemoveHeader= filter data by $0>=1; 

A= group RemoveHeader by $2;

A1= foreach A generate group,COUNT(RemoveHeader.$1);

B= filter RemoveHeader by $1 == 'CERTIFIED';

B1= group B by $2;

B2= foreach B1 generate group,COUNT(B.$1);

C= filter RemoveHeader by $1 == 'CERTIFIED-WITHDRAWN';

C1= group C by $2;

C2= foreach C1 generate group,COUNT(C.$1);

joined1= join B2 by $0,C2 by $0,A1 by $0;

--dump joined1;

joined2= foreach joined1 generate $0,$1,$3,$5;

MidOutput= foreach joined2 generate $0,(float)($1+$2)*100/($3),$3;

SecondMidOutput= filter MidOutput by $1>70 and $2 >= 1000;

final= order SecondMidOutput by $1 DESC;

--dump final;

store final INTO '/h1b/queries/Q9' using PigStorage('\t');

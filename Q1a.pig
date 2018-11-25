register /usr/local/hive/lib/hive-exec-1.2.1.jar
register /usr/local/hive/lib/hive-common-1.2.1.jar

data = LOAD '/user/hive/warehouse/project.db/h1b_final' using PigStorage('\t') as(s_no:int, case_status:chararray, employer_name:chararray, soc_name:chararray, job_title:chararray, full_time_position:chararray, prevailing_wage:int, year:chararray, worksite:chararray, longitude:double, latitude:double);

data = foreach data generate job_title, year;
JobFilter = filter data by $0 == 'DATA ENGINEER';
Year1= filter JobFilter  by $1 == '2011';

GroupByYear= group Year1 by $1;

S1= foreach GroupByYear generate group,COUNT($1);
a= group S1 all;				

Year1= filter JobFilter  by $1 == '2012';

GroupByYear= group Year1 by $1;

S2= foreach GroupByYear generate group,COUNT($1);
b= group S2 all;
Year1 = filter JobFilter by $1 == '2013';

GroupByYear= group Year1 by $1;			

S3= foreach GroupByYear generate group,COUNT($1);

c= group S3 all;
Year1= filter JobFilter  by $1 == '2014';                           

GroupByYear= group Year1 by $1;		

S4= foreach GroupByYear generate group,COUNT($1);

d= group S4 all;
Year1= filter JobFilter  by $1 == '2015';                           

GroupByYear= group Year1 by $1;	

S5= foreach GroupByYear generate group,COUNT($1);

e= group S5 all;
Year1= filter JobFilter  by $1 == '2016';                           

GroupByYear= group Year1 by $1;				

S6= foreach GroupByYear generate group,COUNT($1);	

f= group S6 all;

joined= join a by $0, b by $0, c by $0, d by $0, e by $0, f by $0;
--dump joined;
--(all,{(2011,18)},all,{(2012,32)},all,{(2013,41)},all,{(2014,89)},all,{(2015,160)},all,{(2016,251)})


combining = foreach joined generate FLATTEN($1), FLATTEN($3), FLATTEN($5), FLATTEN($7), FLATTEN($9), FLATTEN($11);
--dump combining;
--(2011,18,2012,32,2013,41,2014,89,2015,160,2016,251)

required = foreach combining generate $1,$3,$5,$7,$9,$11;
yearwiseapplications = foreach required generate (float)($1-$0)*100/$0,(float)($2-$1)*100/$1,(float)($3-$2)*100/$2,(float)($4-$3)*100/$3,(float)($5-$4)*100/$4;

finalCount = foreach yearwiseapplications generate ($0+$1+$2+$3+$4)/5;
--dump finalCount;
store finalCount INTO '/h1b/queries/Q1a' using PigStorage('\t');

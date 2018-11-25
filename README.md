# h1b-data-alaysis

The H1B is an employment-based, non-immigrant visa category for temporary foreign workers in the United States. For a foreign national to apply for H1B visa, a US employer must offer a job and petition for H1B visa with the US immigration department. This is the most common visa status applied for and held by international students once they complete college/ higher education (Masters, Ph.D.) and work in a full-time position. Here we have a .csv file with about 3 million records of applicants who had applied for H1B Visa between 2011-2016. 
-----------------------------------------------------------------------------------------------------------------------
Requirements:

Windows:
* Ram: 6-8GB
* Hard Disk Space: 30+ GBs
* Softwares Used: VMWare for Ubuntu <br/>The windows setup needs above mentioned apparatus to run LINUX virtually. The Hadoop system runs majorly on Cloudera or Linux.
               
LINUX:
* Ram: 2-4 GB.
* Hard Disk Space: 30+ GB.
* Hadoop System Version: 2.6.0
* Java Version: 1.8.0_171
* Pig Version: 0.13.0
* Hive Version: 1.2.1
* Other Tools: Gedit, Eclipse, Ubuntu Terminal.
--------------------------------------------------------------------------------------------------------------------------
Steps Followed:

      *   A .csv file is given with 3 million records and each record has 11 columns representing-
      
                                              --- Serial Number
                                              --- Case Status
                                              --- Employer Name
                                              --- SOC Name
                                              --- Job Title
                                              --- Full Time/Part Time
                                              --- Wage
                                              --- Year
                                              --- Worksite
                                              --- Latitude
                                              --- Longitude
                                              
      *   This file is first uploaded on the local host.
      *   But this file has some irregularities(some names are in double quotes), which must be removed in order to be operated. So, with the help of sql, it is made proper (using the file "sort") and again re-uploaded on the localhost.
      *   Then this file is operated upon using various Hadoop Technologies (HDFS, PIG and HIVE) to get the results.
      *   A script file to run the answers of all the queries written above, named "SMENU", is used.
--------------------------------------------------------------------------------------------------------------------------
RESULTS:
At the end of the analysis, the following queries were answered:

  * Is the number of petitions with Data Engineer job title increasing over time?
  * Top 5 jobs titles, who have highest average growth rate.
  * US location with the most Data Engineer jobs (Year Wise as well as combined).
  * Top 5 US locations with most certified visa.
  * Industry with most Data Scientist positions.
  * Top Employers who apply for most petition each year.
  * Most popular job positions for H1B Visa applications (Year Wise as well as overall)
  * Percentage of successful applications in each sector.
  * Average Wage for each Job for each year.
  * Most successful employer with success rate more than 70%.
------------------------------------------------------------------------------------------------------------------------

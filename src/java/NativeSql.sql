Select COUNT(yearBorn) as countOfRecordes
from [Registration].[dbo].[Registration]
where  1990<= YEAR(yearBorn) or YEAR(yearBorn) >=2000
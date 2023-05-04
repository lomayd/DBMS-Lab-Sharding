# DBMS-Lab-Sharding

## Execution
```
git clone https://github.com/lomayd/DBMS-Lab-Sharding.git

cd ./DBMS-Lab-RDBMS

[Write down "MYSQL_PASSWORD","MYSQL_ROOT_PASSWORD", "MYSQL_MASTER_ROOT_PASSWORD" in docker-compose.yml]

docker-compose up --detach --scale master=1 --scale slave=2

[Write down mapped port to "dataSources.slave0.jdbcUrl", "dataSources.slave1.jdbcUrl" in /src/main/resources/sharding.yml]

[Write down "dataSources.master.password", "dataSources.slave0.password", "dataSources.slave1.password" in /src/main/resources/sharding.yml]

sudo chmod 777 ./gradlew

./gradlew build

java -jar build/libs/DBMS-Lab-Sharding-0.0.1-SNAPSHOT.jar 
```

## Contents (Apache ShardingSphere)
- Sharding
- Read-Write Splitting
- Data-Masking

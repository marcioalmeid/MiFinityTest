git pull
./mvnw package -DskipTests
cf push minfinity -p target/MiFinityTestApplication-0.1.0.jar


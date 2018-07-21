"# java_server" 
To build:
mvn package
To run:
install java
go to /target folder
java -jar companies-0.1.0.jar


To test rest api in browser:
enter 
http://localhost:8080/{command}

For example
http://localhost:8080/get_company/1
to see company with id 1

Available rest api

GET
/all_companies Return all companies
/get_company/{id} return company with specified id
/delete_company/{id} delete company with specified id

POST
/save_company
[JSON WITH COMPANY DATA]

To test POST requests:

install mingw64
curl -d "@company.json" -X POST http://localhost:8080/save_company -H "Content-Type: application/json"

where company.json  - file containing information about company
you could  see examples in /sample_data subfolder

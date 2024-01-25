# Person registry

En CRUD (åtmistone CR) applikation som användes som demo av Jakarta EE och Microprofile. Endast Jakarta EE-api och Microprofile-API som beroenden vid compile-time. Open Liberty i utvecklingsmiljön, slimmad till endast Rest, CDI, Persistence och JSON-B samt Microprofile OpenAPI. Går därmed att deploya på olika Jakarta EE/MP-kompatibla applikationsservrar som är provisionerade med olika relationsdatabaser.

## Installation
### `mvn clean package`
### `mvn liberty:dev`
Kör applikationen i dev mode [http://localhost:9080](http://localhost:9080) \
OpenAPI UI: [http://localhost:9080/openapi/ui](http://localhost:9080/openapi/ui)

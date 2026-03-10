Here's an improved version of your README with emojis and detailed insights based on your `pom.xml`:

---

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Java 17](https://img.shields.io/badge/Java%2017-007396?style=flat-square&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![WebClient](https://img.shields.io/badge/WebClient-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Reactive](https://img.shields.io/badge/Reactive-6DB33F?style=flat-square&logo=reactivex&logoColor=white)
![MapStruct](https://img.shields.io/badge/MapStruct-4C9A9F?style=flat-square&logo=mapstruct&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-BC0000?style=flat-square&logo=projectlombok&logoColor=white)
![REST API](https://img.shields.io/badge/REST%20API-FF6C37?style=flat-square&logo=postman&logoColor=white)
![RestCountries API](https://img.shields.io/badge/RestCountries%20API-FFD700?style=flat-square&logo=api&logoColor=black)
![Java Records](https://img.shields.io/badge/Java%20Records-007396?style=flat-square&logo=openjdk&logoColor=white)
![DevTools](https://img.shields.io/badge/DevTools-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Backend](https://img.shields.io/badge/Backend-000000?style=flat-square&logo=server&logoColor=white)

---

# 🌍 GeoGet – Country Information API

> **Fetch detailed country data effortlessly** – a Spring Boot application that consumes the [Rest Countries API](https://restcountries.com) and exposes clean, ready-to-use endpoints.

## 🚀 Features

- ✅ Search countries by **name**, **language**, **region**, **capital**, or **currency**
- ✅ Built with **Spring Boot 3.5.6** and **Java 17**
- ✅ Reactive calls using **WebClient** for efficient external API consumption
- ✅ Clean DTOs with **Records** and mapping with **MapStruct** + **Lombok**
- ✅ Developer friendly – just clone, build, and run

## 🧰 Tech Stack (from `pom.xml`)

| Dependency | Purpose |
|------------|---------|
| `spring-boot-starter-web` | REST controllers and traditional web support |
| `spring-boot-starter-webflux` | Reactive WebClient for calling external APIs |
| `mapstruct` + `mapstruct-processor` | Type-safe bean mapping (DTOs ↔ Entities) |
| `lombok` | Boilerplate code reduction (`@Data`, `@Builder`, etc.) |
| `lombok-mapstruct-binding` | Smooth integration between Lombok and MapStruct |
| `spring-boot-devtools` | Automatic restarts during development |
| `spring-boot-starter-test` | Testing utilities |

- **Build tool**: Maven
- **Java version**: 17

## 📡 API Endpoints

All endpoints return JSON data about countries.

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/v1/countries/name/{name}` | Search by common name (e.g., `france`) |
| `GET` | `/api/v1/countries/lang/{language}` | Search by language (e.g., `spanish`) |
| `GET` | `/api/v1/countries/region/{region}` | Filter by world region (e.g., `europe`) |
| `GET` | `/api/v1/countries/capital/{capital}` | Search by capital city (e.g., `paris`) |
| `GET` | `/api/v1/countries/currency/{currency}` | Search by currency code or name (e.g., `eur`) |

## 🛠️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/GeoGet.git
   cd GeoGet
   ```

2. **Build with Maven**
   ```bash
   ./mvnw clean install
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access the API**
    - Open your browser or Postman and try:
        - `http://localhost:8080/api/v1/countries/name/france`
        - `http://localhost:8080/api/v1/countries/region/asia`

## 📸 Overview

![GeoGet demo](https://github.com/user-attachments/assets/beee9fc4-3ac8-44c8-a831-85550a60ca98)

## 🔗 External API

This project uses the [Rest Countries API v3](https://restcountries.com/).  
📘 [Official Documentation](https://restcountries.com/#endpoints)

## 📁 Project Structure (Key Packages)

```
com.wrath.GeoGet
├── controller     → REST endpoints
├── exceptions     → Customs exceptions
├── services       → Business logic + WebClient calls
├── models         → DTOs (Java records) and external API response classes
├── mappers        → MapStruct interfaces for object mapping
└── config         → WebClient configuration (if any)
```

## 📄 License

This project is for demonstration purposes – feel free to adapt and use.

---

## 👤 Author

**KENMOE Marc**

Github: [@kenmoe](https://github.com/KENMOEmarc)

Email: [kenmarcbertrand@gmail.com](kenmarcbertrand@gmail.com)

---
Let me know if you'd like to add more sections (e.g., configuration properties, Docker support, or detailed response examples)!
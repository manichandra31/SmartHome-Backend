# Smart Home Energy Management System (Backend)

A Spring Boot backend project for managing smart home devices and energy consumption. This project is ideal for showcasing **Spring Boot, MySQL, and REST API skills** for fresher resumes.

---

## 🛠️ Technologies Used
- **Backend:** Java, Spring Boot  
- **Database:** MySQL  
- **API Testing:** Postman  
- **Security:** Spring Security (Basic Auth)  
- **Build Tool:** Maven  
- **Lombok** for boilerplate code reduction  

---

## 📦 Project Structure
- `entities/` - JPA entities (User, Device, EnergyReading)  
- `repository/` - Spring Data JPA repositories  
- `service/` - Business logic  
- `controller/` - REST API endpoints  
- `config/` - Spring Security configuration  

---

## 🔹 Features
- Add, update, retrieve, and delete smart home devices  
- Associate multiple devices with a single user  
- Track energy consumption readings per device  
- Role-based access using Spring Security (Admin & User)  
- RESTful APIs with JSON payloads  

---

## 💾 Sample JSON Payloads

**Add User with Devices and Energy Readings:**

```json
{
  "name": "Alice",
  "email": "alice@example.com",
  "devices": [
    {
      "name": "Smart Plug",
      "status": true,
      "energyReadings": [
        {
          "energyConsumed": 8.1,
          "timestamp": "2025-09-18T12:00:00"
        }
      ]
    }
  ]
}

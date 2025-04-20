# GearUp – Vehicle Service Station Appointment Booking System 🚗🛠️

GearUp is a full-stack microservices-based web application designed to streamline the process of booking vehicle service appointments. This platform aims to reduce long wait times, eliminate scheduling conflicts, and enhance the overall experience for both customers and service stations.

## 🔍 Problem Statement

Traditional vehicle service stations often struggle with managing appointments manually, leading to:
- Overbooking and scheduling conflicts
- Long customer wait times
- Operational inefficiencies
- Low customer satisfaction

**GearUp** addresses these issues through a digital platform that automates and optimizes appointment management.

---

## 🚀 Project Overview

### 🧾 Key Features

- **User Roles with Secure Authentication**  
  Role-based access control using **Keycloak** for admins and customers.

- **Appointment Booking System**  
  Allows vehicle owners to book, reschedule, or cancel appointments with real-time availability.

- **Real-Time Notifications**  
  Notifications via **WebSockets** and **RabbitMQ** for both users and service station staff.

- **Payment Integration**  
  Integrated with **Razorpay** to handle secure transactions.

- **Admin Dashboard**  
  Enables service station managers to:
  - View/manage bookings
  - Monitor real-time queue updates
  - Manage service slots

- **Analytics & Reporting**  
  Insights into customer trends, peak hours, and service durations.

---

## 🛠️ Tech Stack

| Layer               | Technology        |
|--------------------|-------------------|
| Frontend           | React.js          |
| Backend (API)      | Spring Boot       |
| Authentication     | Keycloak          |
| Real-time Comm     | WebSockets, RabbitMQ |
| Payments           | Razorpay          |
| Database           | PostgreSQL / MongoDB |
| Architecture Style | Microservices     |

---

## 👤 User Roles

- **Customer**
  - Register/Login
  - Book/Cancel/Reschedule appointments
  - Receive notifications
  - Make payments

- **Admin (Service Station)**
  - Manage slots and schedules
  - View real-time queue and booking stats
  - Access reports and trends

---

## 🎯 Benefits

- ⏳ **Time-saving**: Reduces wait times and improves slot utilization.
- 🔐 **Secure**: Robust role-based authentication and secure payments.
- 📈 **Data-Driven**: Enables data-informed decisions with reports and trends.
- 📣 **Real-Time Updates**: Ensures users and admins stay in sync via instant alerts.

---

## 📦 Deliverables

- Fully functional web platform with microservices
- Documentation and user manual
- Deployment-ready containerized services
- Presentation and demo video (if part of coursework)

---

## 📌 Assumptions & Constraints

### ✅ Assumptions
- Service stations have stable internet access.
- Users prefer digital bookings over walk-ins.

### ⚠️ Constraints
- Staff may have limited technical skills.
- Real-time features depend on consistent internet connectivity.

---

## 🤝 Contributor

- **Name**: T. Lanojika  
- **Registration Number**: 2020/ICT/50  
- **Institution**: University of Vavuniya  

---

## 📄 License

This project is developed as part of the IT3232 E-Commerce Practical Module at the University of Vavuniya. Licensing details can be discussed upon further development.

---

## 📞 Contact

For questions or contributions, feel free to reach out via email or your preferred collaboration platform.

---


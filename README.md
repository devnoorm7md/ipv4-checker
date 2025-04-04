# IPv4 Checker 🧪

This Kotlin project provides a function to validate IPv4 addresses. It was developed using **Test-Driven Development (TDD)**, with comprehensive unit tests and a flowchart to represent the validation logic.

## ✅ Features
- Checks if the input is a valid IPv4 address.
- Ensures:
  - Exactly four segments separated by dots (`.`)
  - Each segment is a number between `0` and `255`
  - No leading zeros (e.g. `01` is invalid, `0` is valid)
  - No whitespace or non-numeric characters

## 🔍 Example

```kotlin
isValidIPv4("192.168.1.1")       // true
isValidIPv4("255.255.255.255")   // true
isValidIPv4("192.168.01.1")      // false
isValidIPv4("192.168.1. 1")      // false
isValidIPv4("256.100.50.25")     // false

🧪Test-Driven Development

The function was built by writing tests first, including:

Valid addresses
Invalid segment values
Incorrect formatting
Leading zeros
Extra dots or missing segments


🧭 Flowchart

The decision-making logic is represented visually using draw.io.
[Uploading IPv4.drawio.pdf…]()

🛠️ Technologies

Kotlin
TDD for testing
draw.io for flowchart design


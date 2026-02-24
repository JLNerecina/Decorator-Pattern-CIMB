# Decorator Pattern - CIMB Bank

A Java implementation of the **Decorator Pattern** using CIMB (Banco Comerico Internacional de México), a digital bank offering multiple savings account types with varying interest rates and benefits.

## Overview

CIMB provides three types of savings accounts, each building upon the standard savings account with additional features and higher interest rates:

| Account Type | Interest Rate | Key Benefits |
|---|---|---|
| **Savings Account** | 1.0% | Standard features |
| **GSave** | 2.5% | Standard features + GCash Transfer |
| **UpSave** | 4.0% | Standard features + Insurance |

## Account Details

### Base Account Information
Each account contains:
- **Account Number**: Unique identifier for the account
- **Account Name**: Name of the account holder
- **Balance**: Current account balance

### Implemented Methods

| Method | Description | Returns |
|---|---|---|
| `showAccountType()` | Displays the account type | "Savings Account", "GSave", or "UpSave" |
| `getInterestRate()` | Returns the annual interest rate | 1% / 2.5% / 4.0% depending on account type |
| `getBalance()` | Returns the current account balance | Current balance value |
| `showBenefits()` | Lists all account benefits | List of benefits for the account type |
| `computeBalanceWithInterest()` | Calculates balance after applying interest | New balance (balance × (1 + interest rate)) |
| `showInfo()` | Displays complete account details | Account number, name, and balance |

## Design Pattern

This project implements the **Decorator Pattern**, a structural design pattern that allows behavior to be added to objects dynamically. Each account type (GSave, UpSave) decorates the base SavingsAccount with additional features.

### Key Components

- **BankAccount** (Interface): Defines the contract for all account types
- **BankAccountDecorator** (Interface): Defines the decorator interface
- **SavingsAccount** (Concrete Component): The base savings account implementation
- **GSave** (Concrete Decorator): Adds GCash Transfer feature to the savings account
- **UpSave** (Concrete Decorator): Adds Insurance feature to the savings account
- **CIMB** (Client): Demonstrates usage of the pattern

## Class Diagram

![Decorator Pattern UML Diagram](https://github.com/JLNerecina/Decorator-Pattern-CIMB/blob/main/Decorator%20Pattern%20UML.png)

## Usage Example

```java
// Create a base savings account
BankAccount account = new SavingsAccount("001", "John Doe", 10000);

// Decorate with GSave features
account = new GSave(account);

// Decorate with UpSave features (or use UpSave instead of GSave)
// account = new UpSave(account);

// Use the account
System.out.println(account.showAccountType());        // GSave
System.out.println(account.getInterestRate());        // 2.5
System.out.println(account.showBenefits());           // Standard + GCash Transfer
System.out.println(account.computeBalanceWithInterest()); // 10250
System.out.println(account.showInfo());               // Full account details
```

## Requirements

- **Java 8** or higher
- BankAccount must be an interface
- BankAccountDecorator must be an interface

## Files

- `BankAccount.java` - Interface defining account contract
- `BankAccountDecorator.java` - Interface for decorators
- `SavingsAccount.java` - Base savings account implementation
- `GSave.java` - Decorator adding GCash Transfer feature
- `UpSave.java` - Decorator adding Insurance feature
- `CIMB.java` - Demonstration/main class
- `README.md` - This file
- `Decorator Pattern UML.png` - UML diagram

## Key Advantages of This Implementation

✅ **Flexible**: Easily add new account types without modifying existing code
✅ **Maintainable**: Each feature is encapsulated in its own decorator
✅ **Composable**: Features can be combined in various ways
✅ **Single Responsibility**: Each class has one reason to change

---

**Author**: JLNerecina  
**Pattern**: Decorator (Structural Design Pattern)   
**Last Update**: December 2025

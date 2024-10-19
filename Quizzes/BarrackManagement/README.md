# Barrack Management - Java Exercise

This folder contains a Java-based exercise where I simulate a military barrack management system. The goal of this exercise is to improve my understanding of object-oriented programming, particularly class interactions, encapsulation, and methods.

## Purpose of the Exercise

In this exercise, I have implemented a simple management system for soldiers in a military barrack. The main concepts covered include:
- Adding soldiers to a barrack
- Assigning weapons to soldiers
- Upgrading the rank of soldiers
- Displaying the details of each soldier, including their ID, rank, and assigned weapons.

## Class Structure

### 1. Soldier Class
- **Attributes**:
    - `id`: A unique identifier for each soldier.
    - `rank`: The rank of the soldier (e.g., Private, Sergeant, Lieutenant).
    - `weapons[]`: An array to store up to 3 weapons assigned to the soldier.
- **Methods**:
    - `upgradeRank()`: Promotes the soldier to the next rank (up to Lieutenant).
    - `addWeapon()`: Adds a weapon to the soldier’s list (if they have fewer than 3 weapons).
    - `displayInfo()`: Displays the soldier’s ID, rank, and weapons.

### 2. Barrack Class
- **Attributes**:
    - `soldiers[]`: An array to store all soldiers within the barrack.
- **Methods**:
    - `addSoldier()`: Adds a soldier to the barrack (up to a predefined capacity).
    - `assignWeaponToSoldier()`: Assigns a weapon to a specific soldier.
    - `upgradeSoldierRank()`: Promotes a specific soldier to the next rank.
    - `displayAllSoldiers()`: Displays the information of all soldiers in the barrack.

### 3. BarrackManagement Class (Main Class)
- The main class where the logic of adding soldiers, assigning weapons, upgrading ranks, and displaying soldier information is implemented.

## Example Scenario

- Add 3 soldiers with different ranks to the barrack.
- Assign different weapons to the soldiers, up to 3 weapons per soldier.
- Upgrade the rank of soldiers based on their current rank.
- Display the final state of all soldiers, including their ranks and weapons.

## Skills Demonstrated

- Object-Oriented Design (OOD)
- Encapsulation and private methods
- Array handling in Java
- Method chaining for class interaction

## Future Improvements

I plan to expand this exercise by:
- Adding more ranks and weapons.
- Implementing methods for removing soldiers or transferring them to other barracks.
- Allowing more detailed soldier attributes such as health status and combat experience.


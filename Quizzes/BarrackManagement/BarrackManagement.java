package Quizzes.BarrackManagement;

public class BarrackManagement {
    public static void main(String[] args) {
        Barrack barrack = new Barrack(10); // Assume a barrack can have up to 10 soldiers

        // Adding soldiers to the barrack
        Soldier soldier1 = new Soldier(1, "Private");
        Soldier soldier2 = new Soldier(2, "Sergeant");
        Soldier soldier3 = new Soldier(3, "Lieutenant");

        barrack.addSoldier(soldier1);
        barrack.addSoldier(soldier2);
        barrack.addSoldier(soldier3);

        // Assigning weapons
        barrack.assignWeaponToSoldier(1, "Rifle");
        barrack.assignWeaponToSoldier(1, "Pistol");
        barrack.assignWeaponToSoldier(2, "Sniper");
        barrack.assignWeaponToSoldier(3, "Shotgun");

        // Displaying all soldiers' info
        barrack.displayAllSoldiers();

        // Upgrading soldier's rank
        barrack.upgradeSoldierRank(1);
        barrack.upgradeSoldierRank(2);

        // Displaying updated soldier info
        System.out.println("\nAfter Rank Upgrade:");
        barrack.displayAllSoldiers();
    }
}

class Soldier {
    private int id;
    private String rank;
    private String[] weapons;
    private int weaponCount;

    public Soldier(int id, String rank) {
        this.id = id;
        this.rank = rank;
        this.weapons = new String[3]; // A soldier can have a maximum of 3 weapons
        this.weaponCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getRank() {
        return rank;
    }

    public void upgradeRank() {
        if (rank.equals("Private")) {
            rank = "Sergeant";
        } else if (rank.equals("Sergeant")) {
            rank = "Lieutenant";
        } else {
            System.out.println("Soldier already at highest rank: Lieutenant");
        }
    }

    public boolean addWeapon(String weapon) {
        if (weaponCount < 3) {
            weapons[weaponCount++] = weapon;
            return true;
        } else {
            System.out.println("Cannot assign more weapons to Soldier ID: " + id);
            return false;
        }
    }

    public void displayInfo() {
        System.out.print("Soldier ID: " + id + ", Rank: " + rank + ", Weapons: ");
        for (int i = 0; i < weaponCount; i++) {
            System.out.print(weapons[i] + " ");
        }
        System.out.println();
    }
}

class Barrack {
    private Soldier[] soldiers;
    private int soldierCount;

    public Barrack(int capacity) {
        soldiers = new Soldier[capacity];
        soldierCount = 0;
    }

    public void addSoldier(Soldier soldier) {
        if (soldierCount < soldiers.length) {
            soldiers[soldierCount++] = soldier;
        } else {
            System.out.println("Barrack is full, cannot add more soldiers.");
        }
    }

    public void assignWeaponToSoldier(int soldierId, String weapon) {
        Soldier soldier = findSoldierById(soldierId);
        if (soldier != null) {
            soldier.addWeapon(weapon);
        }
    }

    public void upgradeSoldierRank(int soldierId) {
        Soldier soldier = findSoldierById(soldierId);
        if (soldier != null) {
            soldier.upgradeRank();
        }
    }

    public Soldier findSoldierById(int id) {
        for (int i = 0; i < soldierCount; i++) {
            if (soldiers[i].getId() == id) {
                return soldiers[i];
            }
        }
        System.out.println("Soldier with ID " + id + " not found.");
        return null;
    }

    public void displayAllSoldiers() {
        for (int i = 0; i < soldierCount; i++) {
            soldiers[i].displayInfo();
        }
    }
}


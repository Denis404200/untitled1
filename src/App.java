import java.util.Scanner;
import weapons.*;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
            new Revolver(),
            new GusenbergSweeper()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > weaponSlots.length){
            System.out.format("В данном слоте оружия нет. Попробуйте снова.%n");
            return;
        }else if(slot < 1 && slot != -1){
            System.out.format("Слот " + slot + " не сущесвует.%n");
            return;
        }else if(slot == -1){
            return;
        }
        Weapon weapon = weaponSlots[slot-1];
        weapon.shot(weapon);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Player player = new Player();
            System.out.format("У игрока %d слотов с оружием,"
                + " введите номер, чтобы выстрелить,"
                + " -1 чтобы выйти%n", 
                player.getSlotsCount()
            );
            int slot;
            int number = 0;
            while(number != -1){
                number = scanner.nextInt();
                new Player().shotWithWeapon(number);
            }
            System.out.println("Game over!");
    }
}
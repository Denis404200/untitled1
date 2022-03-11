package weapons;

public class Weapon {

    Weapon wp = null;

    public void Shoot() { }
    public void shot(Weapon weapon) {
        wp = weapon;
        wp.Shoot();
    }
}
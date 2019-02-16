package tugas8;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class Manajer extends Employee {

    private long bonus;

    public Manajer(long bonus, String name, String address, long salary) {
        super(name, address, salary);
        this.bonus = bonus;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    @Override
    public long getSalary() {
        return super.getSalary() + getBonus();
    }
}

package net.nkremlev.codewar.java;

import net.nkremlev.codewar.java.support.Fighter;

/**
 * @see <a href="https://www.codewars.com/kata/577bd8d4ae2807c64b00045b">Two fighters, one winner</a>
 *
 * @author nkremlev
 */
public final class TwoFightersOneWinner {

    /**
     * Получить имя победителя среди двух сражающихся
     * @param fighter1 сражающийся 1
     * @param fighter2 сражающийся 2
     * @param firstAttacker имя первого атакующего
     * @return имя победителя
     */
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (fighter1.health > 0 && fighter2.health > 0) {
            if (fighter1.name.equals(firstAttacker)) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health > 0)
                    fighter1.health -= fighter2.damagePerAttack;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health > 0)
                    fighter2.health -= fighter1.damagePerAttack;
            }
        }

        return (fighter1.health <= 0) ? fighter2.name : fighter1.name;
    }

    //Лучшее решение по мнению code-war
    public static String declareWinnerBest(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a=fighter1, b=fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2; b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
            if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
        }
    }
}

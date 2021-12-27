package com.berg.homework1107;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в
 * IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 *
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 *
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 *
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 * */

public class Task9 {
    public static void main(String[] args) {
        int salary = 600;
        int rice = 400;
        double investBroker = 0;
        int account = 0;
        for (int i = 0; i < 38; i++) {
            if (i%6 == 0){
                salary += rice;
            }
            investBroker += salary*0.1;
            account += salary - 300;
            account += investBroker*0.02;
        }
        System.out.println("Ivan's bank account: " + account);
        System.out.println("Brocker's account: " + investBroker);
    }
}

package homeworkFor2111.ATM;

public class Atm3 {

    private Bill[] result = new Bill[]{
            new Bill(100, 0),
            new Bill(50, 0),
            new Bill(20, 0)};
    private Bill[] billsInAtm;

    public Atm3(Bill[] billsInAtm) {
        this.billsInAtm = billsInAtm;
    }

    int needTake = 0;
    int take = 0;
    int rest = 0;

    public boolean withdraw(int amount) {
        boolean isMoneyTaken = false;

        if (amount > atmBalance()) {
            System.out.println("Not enough money in atm");
            return false;
        }

        int i = 0;
        int currentNominal = billsInAtm[i].getBill();
        if (amount / currentNominal > 1) {
            //100
            rest = takeBill(amount, currentNominal);
            if (rest > 0) {
                //50
                currentNominal = billsInAtm[i + 1].getBill();
                rest = takeBill(rest, currentNominal);
                if (rest > 0) {
                    //20
                    currentNominal = billsInAtm[i + 2].getBill();
                    rest = takeBill(rest, currentNominal);
                    if (rest > 0) {
                        int prevNominal = billsInAtm[i + 1].getBill();
                        rest = takeBill(rest + prevNominal, currentNominal);
                        deleteCurrentFromResult(prevNominal);
                        addToAtm(prevNominal, 1);
                        if (rest > 0) {
                            isMoneyTaken = false;
                        }
                    }
                } else {
                    isMoneyTaken = true;
                }
            } else {
                isMoneyTaken = true;
            }
        } else if (amount / 50 > 1) {
            rest = takeBill(amount, 50);
            ;
        } else if (amount / 20 > 1) {
            rest = takeBill(amount, 20);
        } else {
            System.out.println("Данная сумма не кратна 100/50/20");
            return isMoneyTaken = false;
        }
        if (resultSum() != 0) {
            isMoneyTaken = true;
        }
        return isMoneyTaken;
    }

    private int resultSum() {
        int sum = 0;
        for (Bill bill : result) {
            sum += bill.getBill() * bill.getCount();
        }
        return sum;
    }

    private int atmBalance() {
        int sum = 0;
        for (Bill bill : billsInAtm) {
            sum += bill.getBill() * bill.getCount();
        }
        return sum;
    }

    private int takeBill(int amount, int currentBill) {
        needTake = amount / currentBill;
        for (Bill bill : billsInAtm) {
            if (bill.getBill() == currentBill) {
                take = Math.min(bill.getCount(), needTake);
                putCurrentToResult(currentBill, take);
            }
        }
        rest = amount % currentBill + ((needTake - take) * currentBill);
        return rest;
    }

    private void putCurrentToResult(int bill, int countOfCurrentBill) {
        for (Bill bill1 : result) {
            if (bill1.getBill() == bill) {
                bill1.setCount(bill1.getCount() + countOfCurrentBill);
                deleteFromAtm(bill, countOfCurrentBill);
            }
        }
    }

    private void deleteFromAtm(int bill, int count) {
        for (Bill bill1 : billsInAtm) {
            if (bill1.getBill() == bill) {
                bill1.setCount(bill1.getCount() - count);
            }
        }
    }

    private void addToAtm(int bill, int count) {
        for (Bill bill1 : billsInAtm) {
            if (bill1.getBill() == bill) {
                bill1.setCount(bill1.getCount() + count);
            }
        }
    }

    private void deleteCurrentFromResult(int bill) {
        for (Bill bill1 : result) {
            if (bill1.getBill() == bill) {
                bill1.setCount(bill1.getCount() + -1);
            }
        }
    }

    public Bill[] getBillsInAtm() {
        return billsInAtm;
    }

    public Bill[] getResult() {
        return result;
    }
}

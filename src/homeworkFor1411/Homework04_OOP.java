package homeworkFor1411;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * <p>
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
 * и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */

public class Homework04_OOP {
    public static void main(String[] args) {

        Floor[] floors = {
                new Floor(1, new Flat[]{
                        new Flat(1, new Room[]{
                                new Room(true),
                                new Room(false),
                                new Room(false)
                        }),
                        new Flat(2, new Room[]{
                                new Room(true),
                                new Room(false)
                        }),
                        new Flat(3, new Room[]{
                                new Room(false)
                        }),
                        new Flat(4, new Room[]{
                                new Room(true),
                                new Room(false)
                        }),
                }),
                new Floor(2, new Flat[]{
                        new Flat(5, new Room[]{
                                new Room(true),
                                new Room(false),
                                new Room(false)
                        }),
                        new Flat(6, new Room[]{
                                new Room(true),
                                new Room(false)
                        }),
                        new Flat(7, new Room[]{
                                new Room(false)
                        }),
                        new Flat(8, new Room[]{
                                new Room(true),
                                new Room(false),
                                new Room(false)
                        }),
                }),

        };

        Home home = new Home(158, floors);
        printAllInformation(home);
    }

    public static void printAllInformation(Home home) {
        home.print();
        Floor[] floors = home.floors;
        for (Floor floor : floors) {
            floor.print();
            var flats = floor.flats;
            for (Flat flat : flats) {
                flat.print();
                var rooms = flat.rooms;
                for (Room room : rooms) {
                    room.print();
                }
            }
        }
    }
}

class Home {
    int homeNumber;
    Floor[] floors;

    public Home(int homeNumber, Floor[] floors) {
        this.homeNumber = homeNumber;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом " + homeNumber + ", количество этажей " + floors.length);
    }

}

class Floor {
    int floorNumber;
    Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public void print() {
        System.out.println("Этаж " + floorNumber + ", количество квартир " + flats.length);
    }
}

class Flat {
    int flatNumber;
    Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Квартира " + flatNumber + ", количество комнат " + rooms.length);
    }

}

class Room {
    boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

    public void print() {
        if (isWalkThrough) {
            System.out.println("Проходная комната");
        } else {
            System.out.println("Комната не проходная");
        }
    }
}
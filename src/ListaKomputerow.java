public class ListaKomputerow {
    public static void main(String[] args) {
        Procesor procesor1 = new Procesor("Intel", "i5", 2.3);
        Memory memory1 = new Memory("GoodRam", "DDR4", 4, 2335.00);
        Computer computer1 = new Computer("Lenovo", procesor1, memory1);
        computer1.showInfo();
        Procesor procesor2 = new Procesor("Intel", "i3", 2.30);
        Memory memory2 = new Memory("GoodRam", "DDR3", 8, 123.12);
        Computer computer2 = new Computer("Asus", procesor2, memory2);
        computer2.showInfo();
        Overclock podkrecanie1 = new Overclock();
        podkrecanie1.decreaseCpuClock(computer1, 5);
        computer1.showInfo();
        podkrecanie1.increaseCpuClock(computer1, 456);
        computer1.showInfo();
        podkrecanie1.decreaseCpuClock(computer2, 2);
        computer2.showInfo();
        podkrecanie1.increaseCpuClock(computer2, 100);
        computer2.showInfo();


        computer1.showInfo();
        ComputerAssembly komputerosobisty1 = new ComputerAssembly("MSI","Intel", 5.00, "Goodrammmmm", 125, 2335.00);
        System.out.println(komputerosobisty1.assembly());













    }
}

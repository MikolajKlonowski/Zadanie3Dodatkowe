public class Computer {
    String nazwa;
    Procesor procesor;
    Memory memory;

    Computer(String nz, Procesor pro, Memory mem) {
        this.nazwa = nz;
        this.procesor = pro;
        this.memory = mem;


    }

    Computer() {

    }

    void showInfo() {
        System.out.println(nazwa + " " + procesor.producent + " " + procesor.model + " " + procesor.taktowanie + " " + memory.producent + " " + memory.model + " " + memory.ilosc + " " + memory.taktowanie);
    }
}


public class ComputerAssembly {
    String nazwaKomputer;
    String nazwęProcesora;
    double taktowanieProcesora;
    String nazwęPamięci;
    int ilośćPamieci;
    double taktowaniePamięci;

    ComputerAssembly(String nz, String nzPro, double takPro, String nzPam, int ilPam, double takPam) {
        this.nazwaKomputer = nz;
        this.nazwęProcesora = nzPro;
        this.taktowanieProcesora = takPro;
        this.nazwęPamięci = nzPam;
        this.ilośćPamieci = ilPam;
        this.taktowaniePamięci = takPam;


    }

    String assembly() {
        return "    nazwa PC     " + nazwaKomputer + "       nazwa procesora    " + nazwęProcesora + "    taktowanie procesora     " + taktowanieProcesora + "   nazwa pamieci    " + nazwęPamięci + "    ilość pamieci " + ilośćPamieci + "   taktowanie pamieci    " + taktowaniePamięci;

            }
}




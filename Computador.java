public class Computador {
    String marca;
    float preco;
    SistemaOperacional OS =  new SistemaOperacional();
    HardwareBasico[] HarBas = new HardwareBasico[3];
    MemoriaUSB musb;

    public Computador() {
        for (int i = 0; i < HarBas.length; i++) {
            HarBas[i] = new HardwareBasico();
        }
    }

    public void mostraPCConfigs(){
        System.out.println("Computador: " + marca + " " + preco);
        System.out.println("OS: " + OS.nome + " " + OS.tipo);
        System.out.println(HarBas[0].nome + " " + HarBas[0].capacidade);
        System.out.println("RAM: " + HarBas[1].capacidade);
        System.out.println("HD: " + HarBas[2].capacidade);
        System.out.println("Memória USB: " + musb.nome + " " + musb.capacidade);
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb.capacidade += musb.capacidade;
    }
}

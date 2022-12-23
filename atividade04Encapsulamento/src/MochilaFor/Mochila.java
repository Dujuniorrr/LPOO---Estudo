package MochilaFor;

public class Mochila {

    //        Atributos
            private String material;
            private double pesomáximosuportado;
            private String tipo;
            private boolean abrir;
           
    //        Métodos de acesso
    
            public String getMaterial() {
                return material;
            }
    
            public void setMaterial(String material) {
                this.material = material;
            }
    
            public String getTipo() {
                return tipo;
            }
    
            public void setTipo(String tipo) {
                this.tipo = tipo;
            }
    
            public boolean getAbrir() {
                return abrir;
            }
    
            public void setAbrir(boolean abrir) {
                this.abrir = abrir;
            }
    
            public double getPesomáximosuportado() {
                return pesomáximosuportado;
            }
    
            public void setPesomáximosuportado(double pesomáximosuportado) {
                this.pesomáximosuportado = pesomáximosuportado;
            }
           
           
           
    //        Métodos de abrir
            public void abrirMochila() {
                 if(this.getAbrir() == false){
                    this.setAbrir(true);
                    System.out.println("Barulho de abrindo ziper");
                    System.out.println("Mochila aberta");
                 }else{
                     System.out.println("Mochila ja aberta");
                 }
            }
           
            public void fecharMochila() {
                if(this.getAbrir() == true){
                    this.setAbrir(false);
                    System.out.println("Barulho de abrindo ziper");
                    System.out.println("Mochila fechada");
                }else{
                    System.out.println("Mochila ja fechada");
                }
            }
           
            public void mostrarMochila(){
                System.out.println("Material da mochila " + this.getMaterial());
                System.out.println("Peso máximo suportado" + this.getPesomáximosuportado());
                System.out.println("Tipo " +this.getTipo());
                System.out.println("");
               
            }
        }
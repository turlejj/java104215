import java.util.Scanner;

public class Quadruple<Alpha, Beta, Charlie, Delta> {
    private Alpha alpha;
    private Beta beta;
    private Charlie charlie;
    private Delta delta;

    protected Quadruple(Alpha a, Beta b, Charlie c, Delta d){
        this.alpha=a;
        this.beta=b;
        this.charlie=c;
        this.delta=d;
    }
    public Quadruple listCrew(){
        System.out.println("A members:"+alpha);
        System.out.println("B members:"+beta);
        System.out.println("C members:"+charlie);
        System.out.println("D members:"+delta);

        Quadruple quadruple = new Quadruple(alpha,beta,charlie,delta);

        return quadruple;
    }

    public static void main(String[] args) {

        Quadruple<String,String,String,String> quadrupleInstance = new Quadruple
                <String, String, String,String>
                ("Mateusz","Marek","Ania","Zygfryd");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String c = scanner.nextLine();

        quadrupleInstance.AddUserC(c);
        quadrupleInstance.AddUserB(a);
        quadrupleInstance.listCrew();
    }

    public void AddUserA(Alpha alpha){
        this.alpha=alpha;
    }
    public void AddUserB(Beta beta){
        this.beta=beta;
    }
    public void AddUserC(Charlie charlie){
        this.charlie=charlie;
    }
    public void AddUserD(Delta delta){
        this.delta=delta;
    }

}
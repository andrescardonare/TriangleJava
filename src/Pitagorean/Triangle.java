package Pitagorean;
import java.util.List;
import java.util.ArrayList;


public class Triangle {
    // atributos de catetos, nombre y
    float lado_a = 0, lado_b = 0, lado_c = 0;
    float area = 0;
    String name = "";
    // lista estatica de la clase
    public static List<Triangle> triangleList = new ArrayList<>();

    // constructor
    public Triangle(float a, float b, float c, String n) {
        // garantiza catetos reales positivos
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Triangulo invalido, catetos deben ser mayores a 0!\n");
        }

        // asigna valores de atributos y calcula atributo de area, luego adjunta el objeto a la lista estatica de la clase
        lado_a = a;
        lado_b = b;
        lado_c = c;
        float semi_perim = (a + b + c) / 2;
        area = (float) Math.sqrt(semi_perim * (semi_perim - lado_a) * (semi_perim - lado_b) * (semi_perim - lado_c));

        name = n;

        this.append();
    }

    // inserta los objetos en la lista estatica de la clase, la recorre de menor a mayor hasta encontrar un objeto que
    // tenga un area mayor a este, luego lo incerta en dicha posicion y desplaza el objeto con area mayor a su derecha
    // si no hay ningun objeto en la lista mayor a este, le adjunta al final de la lista
    private void append(){
        //boolean inserted = false;
        for (int i = 0; i < triangleList.size(); i++){
            if (this.area <= triangleList.get(i).area){
                triangleList.add(i, this);
                //inserted = true;
                return;
            }
        }
        //if (!inserted){
            triangleList.add(this);
        //}
    }
}
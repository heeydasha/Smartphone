public class Main
{
    //variable declared for object class

    String manufacturer;    // company
    String model;            // specific model
    String operatingSys;    // operating system android, ios, linux...
    String memory;            // memory in GB
    String color;            // primary color
    String cameraLenses;        // number of camera lenses
    String price;            // how much does it cost


    public Main (String manufacturer, String model, String operatingSys, String memory,
                String color, String cameraLenses, String price)

    {   this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSys = operatingSys;
        this.memory = memory;
        this.color = color;
        this.cameraLenses = cameraLenses;
        this.price = price;
    }

    public void show() {
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("model: " + model);
        System.out.println("operatingSys: " + operatingSys);
        System.out.println("memory: " + memory);
        System.out.println("cameraLenses: " + cameraLenses);
        System.out.println("price: " + price);
    }
}

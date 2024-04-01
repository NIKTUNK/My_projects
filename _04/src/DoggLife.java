public class DoggLife
{
    public static void main(String[] arg)
    {
        Dogg sam = new Dogg("grey");
        sam.setName("Сэр Сэм");
        Dogg pit = new Dogg();
        pit.setName(sam.getName());
        System.out.println(pit.getName());
        System.out.println(sam.getName());
        System.out.println(sam.getWeight());
        System.out.println(sam.getEnergy());
        System.out.println(sam.getStatus());
        sam.sleep();
        System.out.println(sam.getEnergy());
        System.out.println(sam.getStatus());
        System.out.println(sam.getColor());
        sam.setHair("brown");
        System.out.println(sam.getHair());
        sam.setTransportType(TransportType.BICYCLE);
    }
}

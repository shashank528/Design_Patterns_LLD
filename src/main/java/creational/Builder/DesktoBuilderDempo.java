package creational.Builder;
//Product class
class Desktop
{
    private String ram;
    private String rom;
    private String graphiccard;
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getGraphiccard() {
        return graphiccard;
    }

    public void setGraphiccard(String graphiccard) {
        this.graphiccard = graphiccard;
    }
    public String toString()
    {
        String str = "ram="+ ram +" rom ="+rom+" graphiccard ="+graphiccard;
        return str;
    }
}
abstract class  DesktopBuilder
{
    protected Desktop desktop=new Desktop();
    private String ram;
    private String rom;
    private String graphiccard;
    public abstract void buildram(String ram);
    public abstract void buildrom(String rom);
    public abstract void buildgraphiccard(String graphiccard);
    public Desktop build()
    {
        return desktop;
    }
}
class DellDesktopBuilder extends DesktopBuilder
{
    private String ram;
    private String rom;
    private String graphiccard;

    @Override
    public void buildram(String ram) {
        desktop.setRam(ram);
    }

    @Override
    public void buildrom(String rom) {
        desktop.setRom(rom);
    }

    @Override
    public void buildgraphiccard(String graphiccard) {
        desktop.setGraphiccard(graphiccard);
    }
}
class HpDesktopBuilder extends DesktopBuilder
{
    private String ram;
    private String rom;
    private String graphiccard;

    @Override
    public void buildram(String ram) {
        desktop.setRam(ram);
    }

    @Override
    public void buildrom(String rom) {
        desktop.setRom(rom);
    }

    @Override
    public void buildgraphiccard(String graphiccard) {
        desktop.setGraphiccard(graphiccard);
    }
}
class Director
{
    public Director()
    {

    }
    public Desktop buildOfficeDesktop(DesktopBuilder desktopBuilder)
    {
        desktopBuilder.buildram("8");
        desktopBuilder.buildrom("512");
        desktopBuilder.buildgraphiccard("nvidia");
        return desktopBuilder.build();
    }
    public Desktop buildGamingDeskTop(DesktopBuilder desktopBuilder)
    {
        desktopBuilder.buildram("32");
        desktopBuilder.buildrom("1TB");
        desktopBuilder.buildgraphiccard("nvidia");
        return desktopBuilder.build();
    }
}
public class DesktoBuilderDempo {
    public static void main(String[] args) {
        Director director=new Director();
        DesktopBuilder desktopBuilder = new DellDesktopBuilder();
        Desktop desktop = director.buildOfficeDesktop(desktopBuilder);
        System.out.println(desktop);
    }
}

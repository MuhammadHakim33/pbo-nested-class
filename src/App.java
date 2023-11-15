public class App {
    public static void main(String[] args) throws Exception {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        CPU.Harddisk barracuda = myKomputer.new Harddisk(1000, "seagate");

        CPU.Motherboard h410m = myKomputer.new Motherboard("LGA1200", "Gigabyte");

        CPU.PowerSuply cv650 = myKomputer.new PowerSuply(650, "Corsair");

        CPU.VGACard ztrio = myKomputer.new VGACard("RTX 3080", 10,"MSI");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getRAMInfo();

        // bikin object harddisk, vga, motherboard, powersupply
        barracuda.getHarddiskInfo();
        h410m.getMotherboardInfo();
        cv650.getPowerSuplyInfo();
        ztrio.getVGACardInfo();
    }
}

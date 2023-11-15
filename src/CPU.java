import java.text.NumberFormat;
import java.util.Locale;

public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
            int jumlahRAM;
            String manufacturer;

            RAM(int jumlahRAM, String manufacturer) {
                this.jumlahRAM = jumlahRAM;
                this.manufacturer = manufacturer;
            }

            public void getRAMInfo() {
                System.out.println("Jumlah RAM: " + this.jumlahRAM);
                System.out.println("Pabrik: " + this.manufacturer);
            }
    }

    // inner class Harddisk
    public class Harddisk {
        int size;
        String manufacturer;

        Harddisk(int size, String manufacturer) {
            this.size = size;
            this.manufacturer = manufacturer;
        }

        public void getHarddiskInfo() {
            System.out.println("Size Penyimpanan: " + this.size);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class Motherboard
    public class Motherboard {
        String socket;
        String manufacturer;

        Motherboard(String socket, String manufacturer) {
            this.socket = socket;
            this.manufacturer = manufacturer;
        }

        public void getMotherboardInfo() {
            System.out.println("Socket: " + this.socket);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class PowerSuply
    public class PowerSuply {
        int daya;
        String manufacturer;

        PowerSuply(int daya, String manufacturer) {
            this.daya = daya;
            this.manufacturer = manufacturer;
        }

        public void getPowerSuplyInfo() {
            System.out.println("Daya: " + this.daya);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class VGACard
    public class VGACard {
        String tipe;
        int vram;
        String manufacturer;

        VGACard(String tipe, int vram, String manufacturer) {
            this.tipe = tipe;
            this.vram = vram;
            this.manufacturer = manufacturer;
        }

        public void getVGACardInfo() {
            System.out.println("Tipe: " + this.tipe);
            System.out.println("VRAM: " + this.vram);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
}
import java.util.ArrayList;
import java.util.List;

class Shop {
    private List<Notebook> notebooks = new ArrayList<>();

    public void addNotebook(Notebook notebook) { notebooks.add(notebook); }

    public List<Notebook> filterByRam(int minValue) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.getRam() >= minValue) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public List<Notebook> filterByHdd(int minValue) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.getHdd() >= minValue) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public List<Notebook> filterByCpuFrequency(double minValue) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.getCpuFrequency() >= minValue) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
}
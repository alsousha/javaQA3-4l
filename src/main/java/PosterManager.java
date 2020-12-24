public class PosterManager {
    private PurchaseItems[] items = new PurchaseItems[0];
    private int countFilms = 10;

    public PosterManager(){
    }
    public PosterManager(int countFilms){
        if(countFilms>0) this.countFilms = countFilms;
    }

    public void add(PurchaseItems item){
        int lenght = items.length + 1;
        PurchaseItems[] tmp = new PurchaseItems[lenght];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public PurchaseItems[] getLastFilms(){
        PurchaseItems[] result = new PurchaseItems[items.length];
        int actualCountFilms;
        if(items.length<this.countFilms) actualCountFilms= items.length;
        else actualCountFilms=countFilms;
        for (int i = 0; i < actualCountFilms; i++) {
            int index = actualCountFilms -i -1;
            result[i] = items[index];
        }
        return result;
    }
//    public void removeById(int id) {
//        int length = items.length - 1;
//        PurchaseItems[] tmp = new PurchaseItems[length];
//        int index = 0;
//        for (PurchaseItems item : items) {
//            if (item.getId() != id) {
//                tmp[index] = item;
//                index++;
//            }
//            items = tmp;
//        }
//    }
}

package genericTask;

public class Property <T>{
    private T like;
    private T price;
    private T disLike;

    public Property(T like, T price, T disLike) {
        this.like = like;
        this.price = price;
        this.disLike = disLike;
    }

    public T getLike() {
        return like;
    }

    public void setLike(T like) {
        this.like = like;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public T getDisLike() {
        return disLike;
    }

    public void setDisLike(T disLike) {
        this.disLike = disLike;
    }
}

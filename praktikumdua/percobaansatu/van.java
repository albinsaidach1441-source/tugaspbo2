package percobaansatu;

class van extends Vehicle{
    private Speed speed;
    
    public Speed getSpeed(){
        return speed;
    }
    public void setSpeed(Speed speed){
        this.speed = speed;
    }
    
    public void print(){
        System.out.println("vin: " +this.getVin() + ", Max Speed: " +speed.getMax());
    }
}

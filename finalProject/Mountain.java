//package finalProject;

public class Mountain {

   private String mountName;
   private String country;
   private Double elevation;

   public void setMount(String mountain) {
    this.mountName = mountain;

   }
   public String getMount() {
    return this.mountName;

   }
   public void setCountry(String mountCountry) {
    this.country = mountCountry;

   }
   public String getCountry(){
      return this.country;
   }
   public void setElevation(Double mountElevation) {
    this.elevation = mountElevation;

   }
   public Double getElevation(){
      return this.elevation;
   }
   public Double toMeters(Double ftElevation) {
    Double mElevation = ftElevation / 3.2808;
    return mElevation;


   }
}

/***********************************************************************
 * Module:  Vol.java
 * Author:  Toshiba
 * Purpose: Defines the Class Vol
 ***********************************************************************/

import java.util.*;

/** @pdOid 0cf988a6-4bb8-41d3-8bda-aa7692185086 */
public class Vol {
   /** @pdOid 896afed9-c429-410e-8794-8c6e5ed53215 */
   private String idVol;
   /** @pdOid 89e14f60-76d6-4e4c-8a42-f16b5e721818 */
   private String description;
   /** @pdOid e68dbc03-99c6-4455-aaf4-a9e20d25c2e5 */
   private Date dateVol;
   
   /** @pdRoleInfo migr=no name=Companie assc=proposer mult=1..1 side=A */
   public Companie companie;
   
   /** @pdOid 48e71364-1887-4baf-af7a-a7b552b98097 */
   public Vol() {
      // TODO: implement
   }
   
   /** @pdOid 28706dcd-0e86-43d2-baae-e430941c7498 */
   public String getIdVol() {
      return idVol;
   }
   
   /** @param newIdVol
    * @pdOid 4dd3ca1f-8b75-4eb2-8a3b-346694159142 */
   public void setIdVol(String newIdVol) {
      idVol = newIdVol;
   }
   
   /** @pdOid cd09a5c3-e694-4a86-9b8a-5e24c724d591 */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid 5b38b462-cce3-4bb7-8635-651029e1440d */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   /** @pdOid dc1914d0-83a8-401b-8022-e97bfa3e123e */
   public Date getDateVol() {
      return dateVol;
   }
   
   /** @param newDateVol
    * @pdOid 6617391c-63c5-435f-a106-dda4e0a8d376 */
   public void setDateVol(Date newDateVol) {
      dateVol = newDateVol;
   }
   
   
   /** @pdGenerated default parent getter */
   public Companie getCompanie() {
      return companie;
   }
   
   /** @pdGenerated default parent setter
     * @param newCompanie */
   public void setCompanie(Companie newCompanie) {
      if (this.companie == null || !this.companie.equals(newCompanie))
      {
         if (this.companie != null)
         {
            Companie oldCompanie = this.companie;
            this.companie = null;
            oldCompanie.removeVol(this);
         }
         if (newCompanie != null)
         {
            this.companie = newCompanie;
            this.companie.addVol(this);
         }
      }
   }

}
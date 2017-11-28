/***********************************************************************
 * Module:  Companie.java
 * Author:  Toshiba
 * Purpose: Defines the Class Companie
 ***********************************************************************/

import java.util.*;

/** @pdOid 59745c45-bcf6-4b59-bb52-5a5324d26b39 */
public class Companie {
   /** @pdOid 3eded0d4-2bb9-46ac-8a9e-37dfe1d40f6d */
   private String idCompanie;
   /** @pdOid 93de42e8-ce85-4a6d-9256-dbd93a8cb76d */
   private String nomCompanie;
   
   /** @pdRoleInfo migr=no name=Vol assc=proposer coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Vol> vol;
   
   /** @pdOid 2d8a6abe-645a-4e27-abef-10369c573309 */
   public String getIdCompanie() {
      return idCompanie;
   }
   
   /** @param newIdCompanie
    * @pdOid ecef0e0f-20b1-4f3c-b8ae-46794b63fd94 */
   public void setIdCompanie(String newIdCompanie) {
      idCompanie = newIdCompanie;
   }
   
   /** @pdOid 8ab1de12-263d-4e18-8b2d-b2a9031f4fef */
   public String getNomCompanie() {
      return nomCompanie;
   }
   
   /** @param newNomCompanie
    * @pdOid c5237c0f-9bb4-462b-9b20-52fbc7242cbc */
   public void setNomCompanie(String newNomCompanie) {
      nomCompanie = newNomCompanie;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Vol> getVol() {
      if (vol == null)
         vol = new java.util.HashSet<Vol>();
      return vol;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVol() {
      if (vol == null)
         vol = new java.util.HashSet<Vol>();
      return vol.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVol */
   public void setVol(java.util.Collection<Vol> newVol) {
      removeAllVol();
      for (java.util.Iterator iter = newVol.iterator(); iter.hasNext();)
         addVol((Vol)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVol */
   public void addVol(Vol newVol) {
      if (newVol == null)
         return;
      if (this.vol == null)
         this.vol = new java.util.HashSet<Vol>();
      if (!this.vol.contains(newVol))
      {
         this.vol.add(newVol);
         newVol.setCompanie(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldVol */
   public void removeVol(Vol oldVol) {
      if (oldVol == null)
         return;
      if (this.vol != null)
         if (this.vol.contains(oldVol))
         {
            this.vol.remove(oldVol);
            oldVol.setCompanie((Companie)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVol() {
      if (vol != null)
      {
         Vol oldVol;
         for (java.util.Iterator iter = getIteratorVol(); iter.hasNext();)
         {
            oldVol = (Vol)iter.next();
            iter.remove();
            oldVol.setCompanie((Companie)null);
         }
      }
   }

}
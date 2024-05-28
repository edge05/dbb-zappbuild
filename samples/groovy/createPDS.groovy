import com.ibm.dbb.build.*
println("Create new PDS")
def newPDS = new CreatePDS()
newPDS.setDataset("JEDGING.TEST.PDS")
newPDS.setOptions("cyl space(1,1) lrecl(80) dsorg(PO) recfm(F,B) dsntype(library)")
newPDS.execute()
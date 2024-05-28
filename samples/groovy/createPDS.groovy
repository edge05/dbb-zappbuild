import com.ibm.dbb.build.CreatePDS
println('Create new PDS')
HLQ = "JEDGING"
def newPDS = new CreatePDS()
newPDS.setDataset(HLQ + ".TEST.PDS")
newPDS.setOptions("cyl space(1,1) lrecl(80) dsorg(PO) recfm(F,B) dsntype(library)")
newPDS.execute()
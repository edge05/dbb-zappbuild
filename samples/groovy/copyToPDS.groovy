import com.ibm.dbb.build.CopyToPDS
println('Copy USS file to PDS as member')
PDSname = "JEDGING.TEST.PDS"
def newPDS = new CreatePDS()
newPDS.setDataset(PDSname)
newPDS.setOptions("cyl space(1,1) lrecl(80) dsorg(PO) recfm(F,B) dsntype(library)")
newPDS.execute()
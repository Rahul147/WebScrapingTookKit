from sets import Set
def extractAndStore(usedClasses):
	tempClassStore = {}
	with open(usedClasses, 'r') as pageClass:
		for line in pageClass:
			if(tempClassStore.has_key(str(line.strip()))):
				continue;
				
			else:
				tempClassStore[str(line.strip())] = True
	
	return tempClassStore	


pageUsedClasses = "used.txt"
libUsedClasses = ["bootstrap.txt", "material.txt"]
print libUsedClasses[0], libUsedClasses[1]
libClasses = extractAndStore(libUsedClasses[0])
temp = extractAndStore(libUsedClasses[1])
libClasses.update(temp)

pageClasses = extractAndStore(pageUsedClasses)
listOflibClasses = listOfpageClasses = []
for val in libClasses:
	listOflibClasses.append(val)

for val in pageClasses:
	listOfpageClasses.append(val)

setOfpageClasses = Set(listOflibClasses)
setOfpageClasses = Set(listOfpageClasses)

intersectionClasses = setOfpageClasses | setOfpageClasses


with open('result.txt', 'w') as fileToWriteTo:

	for val in list(intersectionClasses):
		fileToWriteTo.write(str(val) + "\n")


		


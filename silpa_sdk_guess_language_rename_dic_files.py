import os

dir_path = "./src/main/res/raw"

for filename in os.listdir(dir_path):
	os.rename(dir_path + "/" + filename, dir_path + "/" + "silpa_sdk_guess_language_dic_" + filename.lower())


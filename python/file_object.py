# you should not use this method
# you have to close the file if you use this method

f = open('test.txt', 'r')

#print(f.name)
#print(f.mode)

f.close()

## now its better to use a context manager

with open('test.txt', 'r') as file:


# file.read() will read the whole file/ you can pass the size/ how much you want to read
#    file_content = file.read()

# file.readlines() will return a list of all the lines in the file
#    file_content = file.readlines()

# file.readline() will online read one line at a time
#    file_content = file.readline()

#    print(file_content)


# using loop to  iterate over a big file
#    for line in file:
#        print(line, end='')


# using while loop to loop over the file and read

    size_to_read = 100
    file_content = file.read(size_to_read)

#    while len(file_content) > 0:
#        print(file_content, end='')
#        file_content = file.read(size_to_read)

###################################  writing to a file  #######################################

#with open('test1.txt', 'w') as file:
#    file.write('this is a test text for the file1')



################################ copying the content of one file into another file #############################

#with open('test.txt', 'r') as read_file:
#    with open('test_copy.txt', 'w') as write_file:
#        for line in read_file:
#            write_file.write(line)



######################## appending to a file ##############################################

#with open('test.txt', 'a') as file:
#    file.write('this is appending text to a file if it\'s gonna work thougt!')




############################ copying an image  ###########################################

with open('me.jpg', 'rb') as me:
    with open('me_cpy.jpg', 'wb') as me_copy:
        for line in me:
            me_copy.write(line)

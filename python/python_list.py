linux_distroes = ['Debian', 'Ubuntu', 'Fedora', 'CentOS', 'OpenSUSE', 'Arch', 'Gentoo']


number = 0
for x in linux_distroes:
    print(f'{x} is a linux distroe')
    number += 1
print(f'there should be {number} of linux distroes in total!')

first_item = linux_distroes[0]
print(f'{first_item} is the first item in the list!')


last_item = linux_distroes[-1]
print(f'{last_item} is the last item in the list')


# slicing list
debian_distros = linux_distroes[:2]
print(f'{debian_distros} are both debian based distros, i like it!')


# how to convert list with items into string

print(f'{" ".join(debian_distros)} are both debian based distros, i like it!')


# and if the list is int
int_list = list(range(1, 9))
print(f'{" ".join(map(str, int_list))} are numbers in the list')

# printing a list in reverse
print(linux_distroes[::-1])

one = linux_distroes.reverse()
print(one)


# list methods
length = len(linux_distroes)
print(f'the length of the list is {length}')


print(f'the index of Ubuntu in the list is: {linux_distroes.index("Ubuntu")}')


linux_distroes.append('windows')
print(linux_distroes)

linux_distroes.pop(-1)
print(linux_distroes)

linux_distroes.insert(0, 'Mint')
print(linux_distroes)


linux_distroes.insert(3, 'Windows')
print(linux_distroes)


linux_distroes.remove('Windows')
print(linux_distroes)

# extend() adds two lists together.
list_one = list(range(12, 15))
list_two = list(range(15, 21))

list_one.extend(list_two)
print(list_one)


# finding the index of an item in the list using the index()
print(linux_distroes.index('Ubuntu'))


# sorting the list using the sort()

linux_distroes.sort()
print(f'this is the list sorted: {linux_distroes}')


# reversing the items in a list
linux_distroes.reverse()
print(linux_distroes)


# python multidimensional lists
number_sets = [[2, 4, 6, 8, 10], [3, 6, 9, 12, 15], [4, 8, 12, 16, 20]]
print(number_sets[1])
print(number_sets[1][1])


number_sets = [[[1, 2, 3, 4],[5, 6, 7, 8,],[9, 10, 11, 12],], [[13, 14, 15, 16],[17, 18, 19, 20],[21, 22, 23, 24]], [[25, 26, 27, 28], [29, 30, 31, 32], [33, 34, 35, 36]]]
print(number_sets[0][1][2])


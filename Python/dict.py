# dictionary (the dict type)
# { key1: value1, key2: value2, etc }

color_values = {'red':   (1.0, 0.0, 0.0),
                'green': (0.0, 1.0, 0.0),  # you extend a statement to
                'blue':  (0.0, 0.0, 1.0),  # multiple lines
                'black': (0.0, 0.0, 0.0),  # in many cases
                'white': (1.0, 1.0, 1.0)
             }
years_at_job = { 'tom':5, 'mary':11, 'sally':1}

phone_ext={'david':1410,'brad':1137}

print("green is ", color_values['green'])
print("tom at job", years_at_job['tom'], "years")
print('brad\'s ext:', phone_ext['brad'])

print('\nchange years on job for sally')
years_at_job['sally'] = 2  # change to 2 years
print("sally at job", years_at_job['sally'], "years")

print("\nkeys() and values()")
print( years_at_job.keys() )
print( years_at_job.values() )

print("\ndelete mary")
del years_at_job['mary']
print(years_at_job)

print("\nadd jose")
years_at_job['jose'] = 1
print(years_at_job)

print("\nitems()")
print(list(years_at_job.items()))

print("\nget method for mary who does not exist in dict:")
print(years_at_job.get('mary'))
print(years_at_job.get('mary',"unknown"))
print(years_at_job['mary'])     # this will create an error

exit()
# you can place this statement to exit
# your code early, you don't normally need it


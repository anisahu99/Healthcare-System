from where we get patientId (I think from patient service) or we generate manually in appointment service


in book method it not same time of booking (also take care slot hours(time))
means if some one book the slot of 2 oclock, iska kuch duration means 2 se leke 3 bje tk,agli 3 se hongi ya phle se hi slot bnake rkhlo

# docker exec -it e54cfa22dbda0ebe809174282b3a2acf82be095843f83c863057c78f43bf8740 bash
#  kafka-topics --bootstrap-server localhost:9092 --list
#  kafka-console-consumer --bootstrap-server localhost:9092 --topic slots-booked-events --from-beginning


# docker exec -it fc71a602aa54965fecd524fdcaaab0c1bb2ce17f0997f5b802e538c167df6bc4 psql -U admin
# \l -->List of databases
# \c ---><db-name>
# \dt -->List of tables
# SELCT * FROM <table-name>
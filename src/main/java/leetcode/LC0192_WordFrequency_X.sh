# Read from the file file.txt and output all valid phone numbers to stdout.
cat words.txt | tr -s ' ' '\n' | sort | uniq --count | sort -r | awk '{print $2 " " $1}'
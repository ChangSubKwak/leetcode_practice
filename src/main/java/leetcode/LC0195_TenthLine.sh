LC=0
while read line;
do
        LC=$((LC+1))
        if [ $LC  -eq 10 ]
        then
                echo $line
        fi
done < file.txt
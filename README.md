STREAM_1=file --directory=/home/amarendra/file --filename-pattern=*.txt --mode=lines | transform --expression=payload.toUpperCase() | ftp --ftp.factory.host=localhost --ftp.factory.username=amarendra --ftp.factory.password=server --ftp.factory.port=21 --auto-create-dir=true --filename-expression="T(Math).random() + '_'+headers['file_name']" --use-temporary-filename=true
:STREAM_1.transform > log


find . -iname "*" | while read l; do cat $l ; echo; done
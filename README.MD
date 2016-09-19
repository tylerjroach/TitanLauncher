# Build Steps

1. Download the latest protoc from here: [protobuf](https://github.com/google/protobuf/releases)
2. Add protoc-3.0.2-xxx/bin to your path
3. run: ```protoc --javanano_out=src/ -I protos protos/backup.proto```
4. Edit build configurations and select "com.tylerjroach.titan.Launcher" as the Launch Activityos protos/backup.proto
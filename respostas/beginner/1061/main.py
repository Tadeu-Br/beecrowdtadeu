from datetime import datetime

# Sample input
start_day = "Dia 5"
start_time = "08:12:23"
end_day = "Dia 9"
end_time = "06:13:23"

# Convert input to datetime objects
start_datetime = datetime.strptime(f"{start_day} {start_time}", "Dia %d %H:%M:%S")
end_datetime = datetime.strptime(f"{end_day} {end_time}", "Dia %d %H:%M:%S")

# Calculate duration in seconds
duration_seconds = (end_datetime - start_datetime).total_seconds()

# Calculate days, hours, minutes, and seconds
days = int(duration_seconds // (24 * 3600))
remaining_seconds = duration_seconds % (24 * 3600)
hours = int(remaining_seconds // 3600)
remaining_seconds %= 3600
minutes = int(remaining_seconds // 60)
seconds = int(remaining_seconds % 60)

# Output the result
print(f"{days} dia(s)")
print(f"{hours} hora(s)")
print(f"{minutes} minuto(s)")
print(f"{seconds} segundo(s)")

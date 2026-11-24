<script>
  let plan = "Pro";
  const select = (plan) => console.log(plan);
</script>

<button class="card transition-colors" on:click={() => select(plan)}>
  {plan}
</button>
<img src="/card.png" alt="Card preview" />
